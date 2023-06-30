package pxu.edu.vn.bai02;

import java.util.Scanner;

public class PTBN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("GIAI PHUONG TRINH BAC II");
		System.out.println("Nhap cac he so a,b,c la cac so thuc");
		System.out.print("a = ");
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		System.out.print("b = ");
		double b = sc.nextDouble();
		System.out.print("c = ");
		double c = sc.nextDouble();
		double x;
		if(a == 0) {
			if(b != 0) {
				x = -c/b;
				System.out.println("x = "+x);
			} else {
				if(c != 0) {
					System.out.println("PTVN");
				} else {
					System.out.println("PTVSN");
				}
			}
		} else {
			double delta = (b*b) - (4*a*c);
			if(delta > 0) {
				System.out.println("PT co 2 nghiem phan biet");
				double x1 = (-b + Math.sqrt(delta))/2*a;
				System.out.println("x1 = "+x1);
				double x2 = (-b - Math.sqrt(delta))/2*a;
				System.out.println("x2 = "+x2);
			} else {
				if(delta < 0) {
					System.out.println("PTVN");
				} else {
					double xt = -b/2*a;
					System.out.println("PT co nghiem kep x1 = x2 = "+xt);
				}
			}
		}
		System.out.println("CHUONG TRINH KET THUC");
	}

}
