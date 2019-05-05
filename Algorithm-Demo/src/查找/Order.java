package 查找;

import java.util.Scanner;

/**
 * 顺序查找
 * 原理：顺序查找就是按顺序从头到尾依次往下查找，找到数据，则提前结束查找，找不到便一直查找下去，直到数据最后一位
 * 理解:简单的来说就是传入参数，与数组中一个一各比较，相等就返回下标
 * 
 * @author 2514385224
 *
 */
public class Order {
	public static void main(String[] arg) {  
	    int[] a={4,6,2,8,1,9,0,3};
	    //获取键盘输入
	    Scanner input=new Scanner(System.in);
	    System.out.println("请输入你要查找的数：");
	    //存放控制台输入的语句
	    int num=input.nextInt();
	    //调用searc()方法，将返回值保存在result中
	    int result=search(a, num);
	    if(result==-1){
	         System.out.println("你输入的数不存在与数组中。");
	    }
	    else
	         System.out.println("你输入的数字存在，在数组中的位置是第："+(result+1)+"个");
	}
	public static int search(int[] a, int num) {        
	    for(int i = 0; i < a.length; i++) {
	        if(a[i] == num){//如果数据存在
	            return i;//返回数据所在的下标，也就是位置
	        }
	    } 
	    return -1;//不存在的话返回-1
	}
}
