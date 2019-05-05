package 排序;

import java.util.Random;

/**
 * 
 * 直接插入排序
 *  讲一个记录插入到已经排好序的有序表中。

            ① sorted数组的第0个位置没有放数据

            ② 从sorted第二个数据开始处理； 如果该数据比它前面的数据要小，说明该数据要往前面移动。

        步骤：

                a. 首先将数据备份放到sorted的第0个位置当哨兵

                b. 然后将该数据前面那个数据后移

                c. 然后往前搜索， 找到插入位置

                d. 找到插入位置之后讲， 第0个位置的那个数据插入对应位置。

            时间复杂度： O（n*n）， 当待排记录序列为正序时， 时间复杂度提高至O（n）

 * @author 2514385224
 *
 */
public class Direct_insertion_sort {
	
		
		//插入排序： 直接插入排序， 希尔排序
		public static void straighInsertionSort(double[] sorted){
			//获取数组的长度
			int length = sorted.length;
			
			
			for(int i=2; i<length; i++){  //数组的第0个下标没有放数据，从第二个数据开始
				
				//判断后一位小于前一位的数据
				if(sorted[i] < sorted[i-1]){
					
					
					sorted[0] = sorted[i];   //设置哨兵
					sorted[i] = sorted[i-1]; //将数据前面那个数据后移一位
					
					int insert = 0;
					
					
					for(int j=i-2; j>=0; j--){
					
						if(sorted[j] > sorted[0]){
							sorted[j+1] = sorted[j];  //后移一位
						}else{
							insert = j+1;  //插入的位置
							break;
						}
					}
					sorted[insert] = sorted[0];
				}
			}
		}
		
		public static void main(String[] args) {
			Random random = new Random(6);
			int arraySize = 21;
			double[] sorted = new double[arraySize];
			
			System.out.println("排序前:");
			for(int i=1;i<arraySize; i++){
				sorted[i] = (int)(random.nextDouble()*100);
				System.out.print((int)sorted[i] + " ");
			}
			System.out.println();
			
			Direct_insertion_sort.straighInsertionSort(sorted);
			System.out.println("排序后：");
			for (int i = 1; i < sorted.length; i++) {
				System.out.print((int)sorted[i] + " ");
			}
			System.out.println();
		}
	


}
