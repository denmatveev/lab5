package ru.matveev.lab5;
import java.io.*;
import java.util.*;
    class Hexagon extends Figure {
        public String type_hex;
        Hexagon(int id1, int x1, int y1, String name1, String square1, String perimetr1, String de)
        {id = id1; x=x1; y=y1; name = name1; square = square1; perimetr = perimetr1; type_hex = de;}
        void print(){System.out.printf("id-%-3s x:%-3s y:%-3s �����: %-15s ���頤�: %-2s ��ਬ���: %-4s ��� ���㣮�쭨��: %s\n",Integer.toString(id),Integer.toString(x),Integer.toString(y),name,square,perimetr,type_hex);}        
    }