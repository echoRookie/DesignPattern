package StrategyPattern;

import StrategyPattern.AbstractStrategy.IStrategy;
import StrategyPattern.Annotation.PriceAnnotion;

import java.io.File;
import java.io.FileFilter;
import java.lang.annotation.Annotation;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author yangjun6
 * @date 2021-04-27 13:50
 */
public class StrategyFactory {
    private List<Class<?>> classList = new ArrayList<>();
    private final String PACKAGE = "StrategyPattern.ConcreteStrategy";
    public StrategyFactory(){
        init();
    }
    public IStrategy getInstance(int price){
      for (int i = 0; i< classList.size(); i++){
          // 获取类的注解
          Annotation[] annotations= classList.get(i).getDeclaredAnnotations();
          PriceAnnotion priceAnnotion = null;
          for(int j = 0;j<annotations.length; j++){
              if(annotations[j] instanceof PriceAnnotion){
                  priceAnnotion = (PriceAnnotion) annotations[j];
                  break;
              }
          }
          if (price > priceAnnotion.min() && price < priceAnnotion.max()){
              try {
                  return (IStrategy) classList.get(i).newInstance();
              } catch (InstantiationException e) {
                  e.printStackTrace();
              } catch (IllegalAccessException e) {
                  e.printStackTrace();
              }
          }
      }
      return null;
    }
    private void init(){
        try {
            File file = new File(Objects.requireNonNull(this.getClass()
                    .getClassLoader()
                    .getResource(PACKAGE.replace(".", "/"))).toURI());
            File[] listFiles =  file.listFiles(new FileFilter() {
                @Override
                public boolean accept(File pathname) {
                    if (pathname.getName().endsWith(".class")) {//我们只扫描class文件
                        return true;
                    }
                    return false;
                }
            });
            if(listFiles != null && listFiles.length > 0){
                for (int i =0; i< listFiles.length; i++){
                    try {
                        Class<?> clazz = this.getClass().getClassLoader().loadClass(PACKAGE +"."+ listFiles[i].getName().replace(".class", ""));

                            classList.add(clazz);

                    } catch (ClassNotFoundException e) {
                        e.printStackTrace();
                    };
                }
            }
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }
}
