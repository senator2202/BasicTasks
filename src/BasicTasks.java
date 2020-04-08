import java.util.Scanner;


public class BasicTasks {

    public static void main(String[] args) {
        task1();
    }

    /**найти значение функции z = ((a - 3) * b / 2) + c*/
    static void task1() {
        int a;
        int b;
        int c;
        double z;

        System.out.println("Введите a,b,c:\n");
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();

        z = ((a - 3) * b / 2) + c;

        System.out.println("\nz= " + z);
    }

    /**вычислить значение по формуле*/
    static void task2() {
        int a;
        int b;
        int c;
        double z;

        System.out.println("Введите a,b,c:\n");
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();

        z = (b + Math.sqrt((b * b) + 4 * a * c)) / (2 * a) - (Math.pow(a, 3) * c) + Math.pow(b, -2);
        System.out.println("\nz= " + z);
    }

    /**вычислить значение по формуле*/
    static void task3() {
        double x;
        double y;
        double z;

        System.out.println("Введите x,y:\n");
        Scanner in = new Scanner(System.in);
        x = in.nextDouble();
        y = in.nextDouble();

        z = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x * y);
        System.out.println("\nz= " + z);
    }

    /**Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). Поменять местами
     * дробную и целую части числа и вывести полученное значение числа.*/
    static void task4() {
        System.out.println("Введите R:\n");
        Scanner in = new Scanner(System.in);

        double R;
        R = in.nextDouble();

        double z;

        String[] splitter = String.valueOf(R).split("\\.");

        double i = Integer.parseInt(splitter[0]);
        double j = Integer.parseInt(splitter[1]);
        z = j + (i / 1000);
        System.out.println("\nR = " + z);
    }

    /**Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести
     * данное значение длительности в часах, минутах и секундах в следующей форме: ННч ММмин SSc.*/
    static void task5() {
        int T;
        int hours;
        int min;
        int sec;
        System.out.println("Введите T:\n");
        Scanner in = new Scanner(System.in);
        T = in.nextInt();

        hours = T / 3600;
        min = (T - (hours * 3600)) / 60;
        sec = T - hours * 3600 - (min * 60);

        System.out.println("\nЧасы: " + hours);
        System.out.println("\nМинуты: " + min);
        System.out.println("\nСекунды: " + sec);
    }

    /**Для заданной области составить линейную программу, которая печатает true, если точка с координатами (х, у)
     * принадлежит закрашенной области, и false — в противном случае:*/
    static void task6(){
        int x1 = -4, x2 = 4, x3 = -2, x4 = 2;
        int y1 = -3, y2 = 0, y3 = 0, y4 = 4;

        int x, y;

        System.out.println("Введите х,у: \n");
        Scanner in = new Scanner(System.in);
        x = in.nextInt();
        y = in.nextInt();

        if (x >= x1 && x <= x2)
            if (y >= y1 && y <= y2){
                System.out.println("\nТочка принадлежит фигуре!!");
                return;
            }

        if(x>=x3 && x<=x4)
            if(y>=y3 && y<=y4){
                System.out.println("\nТочка принадлежит фигуре!!");
                return;
            }

        System.out.println("\nТочка не принадлежит фигуре!!");
    }

    /*-----------------------------------------------------------------------------------------------*/

    /**Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли
     * он прямоугольным.*/
    static void task11(){
        int a1,a2;
        System.out.println("Введите 2 угла треугольника:\n");
        Scanner in=new Scanner(System.in);
        a1=in.nextInt();
        a2=in.nextInt();

        if ((a1+a2)<180) {
            System.out.println("Такой треугольник существует!\n");
            if(a1==90 || a2==90 || a1+a2==90)
                System.out.println("Этот треугольник прямоугольный!");
            else
                System.out.println("Этот треугольник не прямоугольный!");
        }
        else
            System.out.println("Такого треугольника не существует!");

    }

    /**Найти max{min(a, b), min(c, d)}*/
    static void task22(){
        System.out.println("Введите a,b,c,d:\n");
        Scanner in=new Scanner(System.in);

        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();
        int d=in.nextInt();

        if (a<=b)
            if(c<=d)
                if(a>c)
                    System.out.println(a);
                else
                    System.out.println(c);
            else
                if (a>=d)
                    System.out.println(a);
                else
                    System.out.println(d);
        else
            if(c<=d)
                if(b>c)
                    System.out.println(b);
                else
                    System.out.println(c);
            else
                if (b>=d)
                    System.out.println(b);
                else
                    System.out.println(d);
    }

    /**Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой*/
    static void task33(){
        int x1,x2,x3,y1,y2,y3;
        System.out.println("Введите координаты точек в A(x1,y1), B(x2,y2), C(x3.y3):\n");
        Scanner in=new Scanner(System.in);
        x1=in.nextInt();
        y1=in.nextInt();
        x2=in.nextInt();
        y2=in.nextInt();
        x3=in.nextInt();
        y3=in.nextInt();

        double k1=(y2-y1)/(x2-x1);//угловой кэй между 1 и 2 точкой
        double k2=(y3-y2)/(x3-x2);//угловой кэф между 2 и 3 точками

        if (k1==k2)
            System.out.println("Точки A,B,C лежат на одной прямой!");
        else
            System.out.println("Точки A,B,C не лежат на одной прямой!");
    }

    /**Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через
     * отверстие.*/
    static void task44(){
        int A,B;
        int x,y,z;
        System.out.println("Задайте размеры отверстия (длина, ширина):\n");
        Scanner in=new Scanner(System.in);
        A=in.nextInt();
        B=in.nextInt();
        System.out.println("Задайте размеры кирпича (длина, ширина, глубина:)\n");
        x=in.nextInt();
        y=in.nextInt();
        z=in.nextInt();
        if (x<=A && y<=B) {
            System.out.println("Кирпич пройдет!");
            return;
        }
        if(y<=A && x<=B){
            System.out.println("Кирпич пройдет!");
            return;
        }
        if(y<=A && z<=B){
            System.out.println("Кирпич пройдет!");
            return;
        }
        if(z<=A && y<=B){
            System.out.println("Кирпич пройдет!");
            return;
        }
        if(x<=A && z<=B){
            System.out.println("Кирпич пройдет!");
            return;
        }
        if(z<=A && x<=B){
            System.out.println("Кирпич пройдет!");
            return;
        }
        System.out.println("Кирпич не пройдет!");
    }

    /**Вычислить значение функции*/
    static void task55(){
        System.out.println("Введите точку, для которой котите посчитать значение функции:\n");
        Scanner in=new Scanner(System.in);
        int x=in.nextInt();
        double y;
        if(x<=3)
            y=Math.pow(x,2)-3*x+9;
        else
            y=1/(Math.pow(x,3)-6);
        System.out.println("Значение функции в точке "+x+" равно "+y);

    }

    /**Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует
     * все числа от 1 до введенного пользователем числа*/
    static void task111(){
        System.out.println("Введите любое целое положительное число:");
        Scanner in=new Scanner(System.in);
        int x=in.nextInt();
        double res=0;
        for(int i=1;i<=x;i++)
            res+=i;
        System.out.println("Сумма всех целых чисел от 1 до "+x+" равно "+res);
    }

    /**Вычислить значения функции на отрезке [а,b] c шагом h*/
    static void task222(){
        System.out.println("Введите начало отрезка, его конец и шаг:");
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int h=in.nextInt();
        int y;
        for (int i=a;i<=b;i+=h){
            if (i<=2)
                y=-i;
            else
                y=i;
            System.out.println("Значение функции в точке "+i+" равно "+y);

        }
    }

    /**Найти сумму квадратов первых ста чисел*/
    static void task333(){
        int sum=0;
        for (int i=1;i<=100;i++){
            sum+=Math.pow(i,2);
        }
        System.out.println("Сумма квадратов первых 100 чисел равна: "+sum);
    }

    /**Составить программу нахождения произведения квадратов первых двухсот чисел*/
    static void task444(){
        double sum=1;
        for (int i=1;i<=200;i++){
            sum*=Math.pow(i,2);
        }
        System.out.println("Произведение квадратов первых 200 чисел равна: "+sum);
    }

    /**Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен
     заданному е. Общий член ряда имеет вид:*/
    static void task555(){
        System.out.println("Введите точность e:");
        Scanner in=new Scanner(System.in);
        double e=in.nextDouble();
        double a;
        double sum=0;
        for (int i=1;i<100;i++){
            a=1/Math.pow(2,i)+1/Math.pow(3,i);
            if (Math.abs(a)>=e)
                sum+=a;
            else{
                System.out.println("Сумма первых "+(i-1)+" членов ряда, чей модуль больше "+e+" равна "+sum);
                return;
            }
        }
    }

    /**Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера*/
    static void task666(){
        for (int i=97;i<123;i++)
            System.out.println("Символ "+(char)i+" в памяти компьютера выглядит так: "+Integer.toBinaryString(i));
    }

    /**Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
     m и n вводятся с клавиатуры*/
    static void task777(){
        System.out.println("Введите диапазон натуральных чисел: ");
        Scanner in=new Scanner(System.in);
        int m=in.nextInt();
        int n=in.nextInt();
        for (int i=m;i<=n;i++){
            System.out.println("\nДелители для числа "+i+": ");
            for (int j=2;j<m;j++){
                if (i%j==0)
                    System.out.print(j+" ");
            }
        }
    }

    /**Даны два числа. Определить цифры, входящие в запись как первого так и второго числа*/
    static void task888(){
        System.out.println("Введите 2 числа: ");
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        String s1=Integer.toString(a);
        String s2=Integer.toString(b);
        String s="";
        for(int i=0;i<s1.length();i++)
            for (int j = 0; j < s2.length(); j++)
                if(s1.toCharArray()[i]==s2.toCharArray()[j])
                    s=s+s1.toCharArray()[i]+" ";
        System.out.println("Цифры, которые входят как в первое так и во второе число: "+s);
    }
}