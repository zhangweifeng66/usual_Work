package Internet;

public class hui_su01 {


public static int[][] arry=new int[8][8];//���̣��Żʺ�
public static int map=0;//�洢�����������

public static void main(String[] args) {
    // TODO Auto-generated method stub

    System.out.println("�˻ʺ�����");
    findQueen(0);
    System.out.println("�˻ʺ����⹲�У�"+map+"�ֿ���");
}

public static void findQueen(int i){//Ѱ�һʺ�ڵ�
    if(i>7){//�˻ʺ�Ľ�  
        map++;
        print();//��ӡ�˻ʺ�Ľ�
        return;
    }
    
    for(int m=0;m<8;m++){//��Ȼ���,�ݹ��㷨
        if(check(i,m)){//���ʺ�ڷ��Ƿ����
            arry[i][m]=1;
            findQueen(i+1);
            arry[i][m]=0;//���㣬������ݵ�ʱ�����������
            }
    }   
}

public static boolean check(int k,int j){//�жϽڵ��Ƿ����
    for(int i=0;i<8;i++){//������г�ͻ
         if(arry[i][j]==1){
                return false;
         }
    }
    for(int i=k-1,m=j-1; i>=0 && m>=0; i--,m--){//�����Խ���
        if(arry[i][m]==1){
                return false;
        }
    }
    for(int i=k-1,m=j+1; i>=0 && m<=7; i--,m++){//����ҶԽ���
        if(arry[i][m]==1){
                return false;
        }
    }
    return true;
}

public static void print(){//��ӡ���
    System.out.print("����"+map+":"+"\n");
    for(int i=0;i<8;i++){
        for(int m=0;m<8;m++){
            if(arry[i][m]==1){  
                //System.out.print("�ʺ�"+(i+1)+"�ڵ�"+i+"�У���"+m+"��\t");
                System.out.print("o ");
            }
            else{
                    System.out.print("+ ");
            }
        }
        System.out.println();
    }
    System.out.println();
}
}