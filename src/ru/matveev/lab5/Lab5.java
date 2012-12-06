package ru.matveev.lab5;
import java.io.*;
import java.util.*;

public class Lab5 {
    public static int key = -1;
    public static Figure test = new Figure();
    public static List<Figure> baze = new ArrayList();
    
    public static void main(String[] args) throws IOException {
      
        
        while(key!=0)
        {
            System.out.println("1 - ������� ������ 䨣���");
            System.out.println("2 - ������� ��㣮�쭨�");
            System.out.println("3 - ������� �����㣮�쭨�");
            System.out.println("4 - ������� ���㣮�쭨�");
            System.out.println("5 - ������� ���㣮�쭨�");
            System.out.println("6 - �뢮� ᯨ᪠ � ��⠫쭮� ���ଠ樥�");
            System.out.println("7 - �������� �� id");
            System.out.println("8 - ����஢�� �� id");
            System.out.println("9 - ����஢�� �� ��ਬ����");
            System.out.println("10- ����஢�� �� 䨣��");
            System.out.println("11- ��६����� 䨣��� � ���");
            System.out.println("12- ��ࠧ��� �⭮�⥫쭮 ��");
            System.out.println("13- ��ࠧ��� �⭮�⥫쭮 ��");
            
            System.out.println("0 - ��室");
            InputStreamReader isr = new InputStreamReader(System.in); 
            BufferedReader br = new BufferedReader(isr); 

            Scanner in = new Scanner(System.in);
            key = in.nextInt();
            switch(key)
            {
                case 1:
                    System.out.println("������ id: ");
                    int id = in.nextInt();
                    System.out.println("������ x: ");
                    int x = in.nextInt();
                    System.out.println("������ y: ");
                    int y = in.nextInt();
                    
                    System.out.println("������ 䨣���: ");
                    String name = in.next();
                    System.out.println("������ ��ਬ���: ");
                    String perimetr = br.readLine();
                    System.out.println("������ ���頤�: ");
                    String square = br.readLine();
                    System.out.println("�� ����� ���� ��������?(�ᥣ�-"+baze.size()+",�������� �� �� - 0)");
                    int pos = in.nextInt();
                    pos = pos -1;
                    if(baze.size()!=0 && pos != -1) 
                         {baze.add(pos,new Figure(id,x,y,name,square,perimetr));}
                    else {baze.add(new Figure(id,x,y,name,square,perimetr));}
                    
                    break;
                case 3:
                    System.out.println("������ id: ");
                    id = in.nextInt();
                    System.out.println("������ x: ");
                    x = in.nextInt();
                    System.out.println("������ y: ");
                    y = in.nextInt();
                    name = "������㣮�쭨�";
                    System.out.println("������ ��ਬ���: ");
                    perimetr = br.readLine();
                    System.out.println("������ ���頤�: ");
                    square = br.readLine();
                    System.out.println("������ ��� �����㣮�쭨��: ");
                    String univ = br.readLine();
                    System.out.println("�� ����� ���� ��������?(�ᥣ�-"+baze.size()+",�������� �� �� - 0)");
                    pos = in.nextInt();
                    pos = pos -1;
                    if(baze.size()!=0 && pos != -1) 
                         {baze.add(pos,new Quadrangle(id,x,y,name,square,perimetr,univ));}
                    else {baze.add(new Quadrangle(id,x,y,name,square,perimetr,univ));}
                    
                
                    break;
                case 4:
                    System.out.println("������ id: ");
                    id = in.nextInt();
                    name = "���㣮�쭨�";
                    System.out.println("������ x: ");
                    x = in.nextInt();
                    System.out.println("������ y: ");
                    y = in.nextInt();
                    System.out.println("������ ��ਬ���: ");
                    perimetr = br.readLine();
                    System.out.println("������ ���頤�: ");
                    square = br.readLine();
                    System.out.println("������ ⨯ ���㣮�쭨��: ");
                    String type_pen = br.readLine();
                    System.out.println("�� ����� ���� ��������?(�ᥣ�-"+baze.size()+",�������� �� �� - 0)");
                    pos = in.nextInt();
                    pos = pos -1;
                    if(baze.size()!=0 && pos != -1) 
                         {baze.add(pos,new Pentagon(id,x,y,name,square,perimetr,type_pen));}
                    else {baze.add(new Pentagon(id,x,y,name,square,perimetr,type_pen));}

                   
                    break;                
                case 2:
                    System.out.println("������ id: ");
                    id = in.nextInt();
                    name = "��㣮�쭨�";
                    System.out.println("������ x: ");
                    x = in.nextInt();
                    System.out.println("������ y: ");
                    y = in.nextInt();
                    System.out.println("������ ��ਬ���: ");
                    perimetr = br.readLine();
                    System.out.println("������ ���頤�: ");
                    square = br.readLine();
                    System.out.println("������ ⨯ ��㣮�쭨��: ");
                    String type_tr = br.readLine();
                    System.out.println("�� ����� ���� ��������?(�ᥣ�-"+baze.size()+",�������� �� �� - 0)");
                    pos = in.nextInt();
                    pos = pos -1;
                    if(baze.size()!=0 && pos != -1) 
                         {baze.add(pos,new Triangle(id,x,y,name,square,perimetr,type_tr));}
                    else {baze.add(new Triangle(id,x,y,name,square,perimetr,type_tr));}
                    
                    break;
               case 5:
                    System.out.println("������ id: ");
                    id = in.nextInt();
                    name = "���㣮�쭨�"; 
                    System.out.println("������ x: ");
                    x = in.nextInt();
                    System.out.println("������ y: ");
                    y = in.nextInt();
                    System.out.println("������ ��ਬ���: ");
                    perimetr = br.readLine();
                    System.out.println("������ ���頤�: ");
                    square = br.readLine();
                    System.out.println("������ ⨯ ���㣮�쭨��: ");
                    String thex = br.readLine();
                    System.out.println("�� ����� ���� ��������?(�ᥣ�-"+baze.size()+",�������� �� �� - 0)");
                    pos = in.nextInt();
                    pos = pos -1;
                    if(baze.size()!=0 && pos != -1) 
                         {baze.add(pos,new Hexagon(id,x,y,name,square,perimetr,thex));}
                    else {baze.add(new Hexagon(id,x,y,name,square,perimetr,thex));}
                    
                    break;
               case 6:
                   
                   //Iterator it = baze.iterator();
                  // int k = 1;
                   for(Figure test: baze)
                  {
                      test.print();
                  }
                  /* while (it.hasNext())
                   {
                       test = (Figure) it.next();
                       System.out.print(k+": ");
                       test.print();
                       k++;
                   }*/
                   
                   break;
              case 7:
                  System.out.print("������ id: ");
                  int id1 = in.nextInt();
                  for(int i = 0; i < baze.size(); i++)
                  {
                   test = (Figure) baze.get(i);
                   if (test.id == id1) 
                   {
                        baze.remove(i);
                        System.out.println("�������� �ந�������!"); 
                        i = baze.size();
                   }
                  }
                  break;
              case 8:
                  
                 for(int i = 0; i < baze.size(); i++)
                  {
                   test = (Figure)baze.get(i);
                   test.SortType = 1;
                   baze.set(i,test);
                  }
                  Collections.sort(baze);
                  break;
              case 9:
                  for(int i = 0; i < baze.size(); i++)
                  {
                   test = (Figure)baze.get(i);
                   test.SortType = 2;
                   baze.set(i,test);
                  }
                  Collections.sort(baze);
                  break;
              case 10:
                  for(int i = 0; i < baze.size(); i++)
                  {
                   test = (Figure)baze.get(i);
                   test.SortType = 3;
                   baze.set(i,test);
                  }
                  Collections.sort(baze);
                  break;
              case 11:
                  System.out.print("������ id: ");
                  id1 = in.nextInt();
                  for(int i = 0; i < baze.size(); i++)
                  {
                   test = (Figure) baze.get(i);
                   if (test.id == id1) 
                   {
                       System.out.println("������ �,�: "); 
                       int xx = in.nextInt();
                       int yy = in.nextInt();
                       test.move(xx, yy);
                       baze.set(i,test);
                        System.out.println("��६�饭�� �ந�������!"); 
                        
                   }
                  }
                  break;
              case 12:
                  System.out.print("������ id: ");
                  id1 = in.nextInt();
                  for(int i = 0; i < baze.size(); i++)
                  {
                   test = (Figure) baze.get(i);
                   if (test.id == id1) 
                   {
                       
                       test.mirrorOfX();
                       baze.set(i,test);
                        System.out.println("��ࠦ���� �ந�������!"); 
                        
                   }
                  }
                  break;
              case 13:
                  System.out.print("������ id: ");
                  id1 = in.nextInt();
                  for(int i = 0; i < baze.size(); i++)
                  {
                   test = (Figure) baze.get(i);
                   if (test.id == id1) 
                   {
                       
                       test.mirrorOfY();
                       baze.set(i,test);
                        System.out.println("��ࠦ���� �ந�������!"); 
                        
                   }
                  }
                  break;
                  
            }
        }
    }
}
