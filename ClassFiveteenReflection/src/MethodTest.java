import NewInstance1.Persona;
import org.junit.Test;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class MethodTest {
    //获取运行时类带泛型的父类的泛型
    //逻辑代码      功能性代码
    @Test
    public void test5(){
        Class clazz = Persona.class;
        Type genericSuperclass = clazz.getGenericSuperclass();
        ParameterizedType parameType= (ParameterizedType) genericSuperclass;
        //获取泛型类型
        Type[] aa = parameType.getActualTypeArguments();
        System.out.println(aa[0].getTypeName());
    }

    //获取运行时类实现的接口
    @Test
    public void test6(){
        Class clazz = Persona.class;

        //获取运行时类实现的接口
        Class[] interfaces = clazz.getInterfaces();
        for (Class c:interfaces){
            System.out.println(c);
        }

        //获取运行时类的父类实现的接口
        System.out.println();
        Class[] interfaces1 = clazz.getSuperclass().getInterfaces();
        for (Class c:interfaces){
            System.out.println(c);
        }
    }
}
