package 查找;

import java.util.Scanner;

/**
 * 二分查找：
 * 
 *  二分查找的基本思想是：首先确定该查找区间的中间点位置： 
 *  int mid = (low+upper) / 
 *  2；然后将待查找的值与中间点位置的值比较：若相等，
 *  	则查找成功并返回此位置。若中间点位置值大于待查值，
 *	 	 则新的查找区间是中间点位置的左边区域。
 *		若中间点位置值小于待查值，
 * 		 则新的查找区间是中间点位置的右边区域。
 * 		下一次查找是针对新的查找区间进行的。
	 * 原始数据： int[] a={5,3,6,1,9,8,2,4,7}; 查找是否存在数字8；
	
	第一步，先用之前学过的排序方法将数组按升序排序：int[] a={1,2,3,4,5,6,7,8,9};
	
	第二步，取中间数：5跟8比较，8大于5 ，取中间数右侧的数组进行比较，即{6,7,8,9}
	
	第三步：重复第一步和第二步，直到找到数据或者比较完所有数据
 * 
 * 
 * 理解:二分法就是先把数据排序，
 * 在取个标识0位用来替代判断后的数，在用个数来获取中间数(=用来替代的数于最大的数/2)得到中间数
 * 在用中间数来与要外来数做判断，如果小于外来数，则说明外来数在中间数的右边，可以使用标识为0的数来替代首个数，在于总数来获取中间数
 * 如果小于，可以用总数代表的数来获取中间数-1来替代在来获取中间数，循环判断
 * 直到判断等于返货下标
 * 
 * 
 * @author 2514385224
 *
 */
public class Two_points {
	 public static void main(String[] args) {
	        int[] arr={5,3,6,1,9,8,2,4,7};
	        //先打印输出原始数组数据
	        System.out.println("原始数组数据如下：");
	        for (int n : arr) {
	            System.out.print(n+" ");
	        }
	        
	        System.out.println();
	        //首先对数组进行排序，这里用冒泡排序
	        
	        sort(arr);
//	        for(int i=0;i<arr.length-1;i++){
//	            for(int j=0;j<arr.length-1-i;j++){
//	                if(arr[j]>arr[j+1]){
//	                    int temp=arr[j];
//	                    arr[j]=arr[j+1];
//	                    arr[j+1]=temp;
//	                }
//	            }
//	        }
	        //遍历输出排序好的数组
	        System.out.println("经过冒泡排序后的数组：");
	        for(int n:arr){
	            System.out.print(n+" ");
	        }
	        System.out.println();//换行
	        Scanner input=new Scanner(System.in);
	        System.out.println("请输入你要查找的数：");
	        int num=input.nextInt();
	        int result=binarySearch(arr, num);
	        if(result==-1){
	            System.out.println("你要查找的数不存在……");
	        }
	        else{
	            System.out.println("你要查找的数存在，在数组中的位置是："+result);
	        }
	    }
	 	/**
	 	 * 冒泡排序
	 	 * 
	 	 * @param arr
	 	 * @return
	 	 */
	 	public static int[] sort(int [] arr)
	 	{
	 		for(int i=0;i<arr.length;i++)
	 		{
	 			for(int j=0;j<arr.length-1;j++)
	 			{
	 				if(arr[i]<arr[j])
	 				{
	 					int temp=arr[j];
	 					arr[j]=arr[i];
	 					arr[i]=temp;
	 				}
	 			}
	 		}
	 		
	 		return arr;
	 	}
	    //二分查找算法
	    public static int binarySearch(int[] arr,int num){
	    
	        int low=0;
	        int upper=arr.length-1;
	        while(low<=upper){
	        	
	            int mid=(upper+low)/2;
	      
	            if(arr[mid]<num){
	            	
	                low=mid+1;
	                
	            }
	            else if(arr[mid]>num){
	            	
	                upper=mid-1;
	               
	            }
	            else
	                return mid;
	            
	        }
	        return -1;
	    }
}
