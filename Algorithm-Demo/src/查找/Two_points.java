package ����;

import java.util.Scanner;

/**
 * ���ֲ��ң�
 * 
 *  ���ֲ��ҵĻ���˼���ǣ�����ȷ���ò���������м��λ�ã� 
 *  int mid = (low+upper) / 
 *  2��Ȼ�󽫴����ҵ�ֵ���м��λ�õ�ֵ�Ƚϣ�����ȣ�
 *  	����ҳɹ������ش�λ�á����м��λ��ֵ���ڴ���ֵ��
 *	 	 ���µĲ����������м��λ�õ��������
 *		���м��λ��ֵС�ڴ���ֵ��
 * 		 ���µĲ����������м��λ�õ��ұ�����
 * 		��һ�β���������µĲ���������еġ�
	 * ԭʼ���ݣ� int[] a={5,3,6,1,9,8,2,4,7}; �����Ƿ��������8��
	
	��һ��������֮ǰѧ�������򷽷������鰴��������int[] a={1,2,3,4,5,6,7,8,9};
	
	�ڶ�����ȡ�м�����5��8�Ƚϣ�8����5 ��ȡ�м����Ҳ��������бȽϣ���{6,7,8,9}
	
	���������ظ���һ���͵ڶ�����ֱ���ҵ����ݻ��߱Ƚ�����������
 * 
 * 
 * ���:���ַ������Ȱ���������
 * ��ȡ����ʶ0λ��������жϺ���������ø�������ȡ�м���(=�������������������/2)�õ��м���
 * �����м�������Ҫ���������жϣ����С������������˵�����������м������ұߣ�����ʹ�ñ�ʶΪ0����������׸�����������������ȡ�м���
 * ���С�ڣ����������������������ȡ�м���-1�����������ȡ�м�����ѭ���ж�
 * ֱ���жϵ��ڷ����±�
 * 
 * 
 * @author 2514385224
 *
 */
public class Two_points {
	 public static void main(String[] args) {
	        int[] arr={5,3,6,1,9,8,2,4,7};
	        //�ȴ�ӡ���ԭʼ��������
	        System.out.println("ԭʼ�����������£�");
	        for (int n : arr) {
	            System.out.print(n+" ");
	        }
	        
	        System.out.println();
	        //���ȶ������������������ð������
	        
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
	        //�����������õ�����
	        System.out.println("����ð�����������飺");
	        for(int n:arr){
	            System.out.print(n+" ");
	        }
	        System.out.println();//����
	        Scanner input=new Scanner(System.in);
	        System.out.println("��������Ҫ���ҵ�����");
	        int num=input.nextInt();
	        int result=binarySearch(arr, num);
	        if(result==-1){
	            System.out.println("��Ҫ���ҵ��������ڡ���");
	        }
	        else{
	            System.out.println("��Ҫ���ҵ������ڣ��������е�λ���ǣ�"+result);
	        }
	    }
	 	/**
	 	 * ð������
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
	    //���ֲ����㷨
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
