package ����;

import java.util.Arrays;

/**
* Created by gy on 2017/8/21.
* email : guoyang000111@163.com
* ��������
*/
public class SelectSort {
   public static void main(String[] args) {
       
	   int a[]={5,2,8,4,1,9,16};
       
       System.out.println("ð������:"+Arrays.toString(bubble(a)));
       
       int b[]={5,2,8,4,1,9,16};
       
       System.out.println("ѡ������"+Arrays.toString(select(b)));
       
       int c[]={5,2,8,4,1,9,16};
       
       System.out.println("��������"+Arrays.toString(insert(c)));

       System.out.println("λ��:"+find(a,8));
   }

   /**
    * ð�ݷ�
    * @param a ��������
    * @return �����������
    */
   public static int [] bubble(int a[]){
       for(int i=0;i<a.length-1;i++){
           for(int j=0;j<a.length-i-1;j++){
               if(a[j]<a[j+1]){
                   int temp=a[j];
                   a[j]=a[j+1];
                   a[j+1]=temp;
               }
           }
       }
       return a;
   }

   /**
    *             ѡ������ ����ð�ݷ�
    * @param a ��������
    * @return �����������
    */

   public static int [] select(int a[]){
       
	   for(int i=0;i<a.length-1;i++){
          
    	   int min=i;
           
           for(int j=i+1;j<a.length;j++){
        	   
        	   if(a[min]>a[j]){
               
        		   min=j;
               
        	   }
           }
           if(min!=i){
               int temp=a[i];
               a[i]=a[min];
               a[min]=temp;
           }
       }
       return a;
   }
   
   /**
    *        �������� ����ǰ����
    * @param a ��������
    * @return �����������
    */
   public static int [] insert(int a[]){
       int compare;
       for(int mark=1;mark<a.length;mark++){
           int  temp =a[mark];
           compare=mark;
           while(compare>0&&a[compare-1]>temp){
               a[compare]=a[compare-1];
               compare--;
           }
           a[compare]=temp;
       }
       return a;
   }

   /**
    * ���ַ�����,ǰ���������Ѿ����� С�����
    * @param a ��С�������������
    * @param value ��Ҫ�ҵ�ֵ
    * @return
    */
   public static int find(int a[],int value){
       int start=0;
       int end=a.length-1;
       while(end>=start){
           int index =(start + end )/2;
           if(a[index]==value){
               return index;
           }else if(a[index]>value){
               end=index-1;
           }else{
               start = index+1;
           }
       }
       return a.length;
   }

}

