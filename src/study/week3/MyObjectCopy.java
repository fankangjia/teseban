package study.week3;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class MyObjectCopy {
	//浅拷贝方法
	public static Object copy2(Object source){
		//创建一个新的对象(空对象)
		Object target=null;		
		
		try {
			Class clz=source.getClass();//获取源对象的class对象
			target=clz.newInstance();//源对象必须有空的构造器
			//获取类中的所有属性
			Field[] fields=clz.getDeclaredFields();
			for (Field field : fields) {
				//获取属性名
				String fieldName=field.getName();
				System.out.println(fieldName);
				//根据属性名称获取setter/getter方法名
				String set="set"+fieldName.substring(0,1).toUpperCase()+fieldName.substring(1);
				String get="get"+fieldName.substring(0,1).toUpperCase()+fieldName.substring(1);
				System.out.println(get);
				System.out.println(set);
				//根据方法名称获取方法对象
				Method method_set=clz.getMethod(set, field.getType());
				Method method_get=clz.getMethod(get);
				//执行源对象的get方法，获取返回值
				Object returnVal=method_get.invoke(source);				
				//执行目标对象的set方法，将源对象方法的返回值作为参数设置给目标对象
				method_set.invoke(target, returnVal);			
			}			
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
	}
		return target;
	}
	// ------------入口-------------深拷贝方法
		public static Object copy(Object source) throws Exception{
			
			Object o = null;
			Class clazz = source.getClass();
			o = clazz.newInstance();
			while(clazz != Object.class){
				
				Field fields[] = clazz.getDeclaredFields();
				for(Field field : fields) {
					if(Modifier.isStatic(field.getModifiers()))
						continue;
					field.setAccessible(true);
					Object value = field.get(source);
					// 基本类型
					if(field.getType().isPrimitive()) {
						field.set(o, value);
					}
					// 数组类型  因为数组类型也是 Object 的实例, 所以写在前面
					else if(field.getType().isArray() ) {
						field.set(o, operateArray(value));
					}
					// 不为null的对象
					else if(value instanceof Object) {
						field.set(o, copy(value));
					}
					field.setAccessible(false);
				}
				clazz = clazz.getSuperclass(); 
			}
			return o;
		}
		
		// 一维数组, 二维
		public static Object operateArray(Object array) throws Exception{
			// 1. 数组不为null, 2. 数组长度 >= 0
			if(array == null)
				return null;
			
			int length = Array.getLength(array);
			Class componentType = array.getClass().getComponentType();
			
			// 基本类型 + String 类型, 因为String 类型的值是不变的, 所以采用等值
			if(componentType.isPrimitive() || componentType == String.class) {
				Object xxx = returnPrimitive(array, length); 
				return xxx;
			}
			// 保证长度 > 0
			if(componentType.isArray()) {
				// 固定长度的多维数组			
				Object value = Array.newInstance(array.getClass().getComponentType(), Array.getLength(array));
				int len = Array.getLength(array);
				for(int i = 0; i < len; i++) {
					Array.set(value, i, operateArray(Array.get(array, i)));
				}
				return value;
			}
			else {
				Object o = null; 
				o = Array.newInstance(componentType, length);
				for(int i = 0; i < length; i++) {
					Object value = copy(Array.get(array, i));
					Array.set(o, i, value);
				}
				return o;
			}
		}
		
		public static Object returnPrimitive(Object array, int length) {
			Class componentType = array.getClass().getComponentType();
			if(componentType == int.class)
				return Arrays.copyOf((int[])array, length);
			if(componentType == double.class)
				return Arrays.copyOf((double[])array, length);
			if(componentType == float.class)
				return Arrays.copyOf((float[])array, length);
			if(componentType == long.class)
				return Arrays.copyOf((int[])array, length);
			if(componentType == boolean.class)
				return Arrays.copyOf((boolean[])array, length);
			if(componentType == byte.class)
				return Arrays.copyOf((byte[])array, length);
			if(componentType == short.class)
				return Arrays.copyOf((short[])array, length);
			if(componentType == char.class)
				return Arrays.copyOf((char[])array, length);
			if(componentType == String.class)
				return Arrays.copyOf((String[])array, length);
				
			return null;
		}
}