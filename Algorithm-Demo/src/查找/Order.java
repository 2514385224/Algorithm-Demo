package ����;

import java.util.Scanner;

/**
 * ˳�����
 * ԭ��˳����Ҿ��ǰ�˳���ͷ��β�������²��ң��ҵ����ݣ�����ǰ�������ң��Ҳ�����һֱ������ȥ��ֱ���������һλ
 * ���:�򵥵���˵���Ǵ����������������һ��һ���Ƚϣ���Ⱦͷ����±�
 * 
 * @author 2514385224
 *
 */
public class Order {
	public static void main(String[] arg) {  
	    int[] a={4,6,2,8,1,9,0,3};
	    //��ȡ��������
	    Scanner input=new Scanner(System.in);
	    System.out.println("��������Ҫ���ҵ�����");
	    //��ſ���̨��������
	    int num=input.nextInt();
	    //����searc()������������ֵ������result��
	    int result=search(a, num);
	    if(result==-1){
	         System.out.println("����������������������С�");
	    }
	    else
	         System.out.println("����������ִ��ڣ��������е�λ���ǵڣ�"+(result+1)+"��");
	}
	public static int search(int[] a, int num) {        
	    for(int i = 0; i < a.length; i++) {
	        if(a[i] == num){//������ݴ���
	            return i;//�����������ڵ��±꣬Ҳ����λ��
	        }
	    } 
	    return -1;//�����ڵĻ�����-1
	}
}
