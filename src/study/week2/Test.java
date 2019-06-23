package study.week2;

import java.util.ArrayList;
import java.util.Iterator;

public class Test{
	//block io
	//aio  
	//伪异步
	//non block io   tomcat dubbo（内部使用netty）  netty 
	//gson  jackson  fastjson 序列化/反序列化
	public interface produce{
		 public void mycall();
	}
	public void consume(produce p){
		p.mycall();
	}
   public static void main(String args[]){ 
//	   produce p=new produce();
	new Test().consume(()->{

			System.out.println("1234");
		});;
	   
//	   int [] a = {10,10,3,4,3,6,3,3,6,0,4,6,4,0};
//	   int [] a ={};
//	   int [] arr = new QuChong2().resolve(a,2);
	 
//	   quchong(a,2);
	/*   quchong( int a[], int cnt); 
	   重复在cnt数以上的，只保留一个，返回去重后的数组*/
	   ArrayList<Integer> arr = new ArrayList<Integer>();
	   
	
	   
	   arr.add(1);
	   arr.add(2);
	   arr.add(3);
	   arr.add(4);
	   arr.add(5);
	   arr.add(6);
	   arr.add(7);
	   
	   arr.add(8);
	   arr.add(9);
	   arr.add(10);
	   arr.add(11);
	   Iterator<Integer> itr = arr.iterator();
	   while(itr.hasNext()){
		   if(itr.next().equals(1)){
			   itr.remove();
		   }
	   }
	  /* for(Integer i:arr){
		   if(i.equals(1)){
			   arr.remove(i);
		   }
	   }*/
	   System.out.println(arr);
	  
	  
  }
   
   public static int[] quchong(int []arr ,int cnt){
	   if(arr==null || arr.length<=0){
		   return null;
	   }
	   if(arr.length==1 || cnt<=0){
		   return arr;
	   }
	   //bitmap
	   boolean [] ab = new boolean[arr.length];//标识哪些元素符合要求，哪些不符合
	   for(int i=0;i<arr.length;i++){
		   int [] repeat=new int[arr.length-i-1];
		   int index=0;
	
		   for(int j=i+1;j<arr.length;j++){
			   if(arr[i]==arr[j]){
				   repeat[index++]=j;
			   }
		   }
		   //重复次数大于等于指定的cnt
		  //重复次数等于指定的cnt  ?
		   if(index>=cnt){
			   for(int k=0;k<index;k++)
				   ab[repeat[k]]=true;
		   }
	   }
	   for(int i=0;i<arr.length;i++){
		   if(!ab[i])
		   System.out.println(arr[i]);
	   }
	   
	   
	return arr;
	   
   }
   
   
   
   public static int [] quchong(int [] arr){
	   if(arr==null || arr.length<=0){
		   return null;
	   }
	   if(arr.length==1){
		   return arr;
	   }
	   int [] res = new int[arr.length];
	 
	   int index=0;   
	   for(int i=0;i<arr.length;i++){
		   boolean flag =true;//标识当前数组元素是否为重复，默认为不重复复
		  for(int j=i-1;j>=0;j--){  //循环遍历回溯已经添加过的数据
			  if(arr[i]==arr[j]){
				  flag=false;   //发现重复元素，置标志位，并跳出循环
				  break;
			  }
		  }
		  if(flag){
			  res[index++]=arr[i];
		  }
	   }
	   
	   //去掉res数组中冗余的数据，将有效数据拷贝到result数组中
	   int [] result = new int[index];
	   for(int p=0;p<index;p++){
		   result[p]=res[p];
		   System.out.println(result[p]);
	   }
	   return result;
	   
   }
   
   
   public static void print(int [] arr){
	   if(arr==null || arr.length<=0){
		   return;
	   }
	    for(int i=0;i<arr.length;i++){
	    	if(arr[i]>0){
	    		System.out.println(arr[i]);
	    	}else{
	    		//几千行代码省略
	    		System.out.println(10/(arr[i]+10));
	    		
	    	}
	    }
	   
   }
   
   public static int sum(int a){
	   
	    if (a==1||a==0){
	    	return a;
	    }
	 return   a+sum(a-2);
	
	   
   }
   
   
}
