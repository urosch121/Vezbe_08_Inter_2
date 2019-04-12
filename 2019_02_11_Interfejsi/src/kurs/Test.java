package kurs;

import java.util.ArrayList;

import moje_klase.Ainf;
import moje_klase.B;
import moje_klase.C;
import moje_klase.D;

public class Test 
{

	public static void main(String[] args) 
	{
		B b = new B();
		b.Boo();
		
		C c = new C();
		c.Boo();
		
		// Ainf a = new A ni u ludilu
		
		if(b instanceof Ainf)
			System.out.println("b implementira Ainf");
		else
			System.out.println("b neimplementira Ainf");
		
		D d = new D();
		d.MetodaIzD();
			
		if(d instanceof Ainf)
			System.out.println("d implementira Ainf");
		else
			System.out.println("d neimplementira Ainf");
			
		System.out.println("************************************");
		
		ArrayList<Ainf> lista = new ArrayList<>();
		
		lista.add(new B());
		lista.add(new C());
		lista.add(new B());
		lista.add(new C());
		// lista.add(new D()); ne moze jer D ne implementira Ainf
		lista.add(new B());
		int i = 1;
		for(Ainf e : lista)
		{
			System.out.println("Element " + i++ + " : ");
			e.Metoda1();
			e.Metoda2();
			e.Metoda3();
		
			//e.Boo(); ne postoji u Ainf
			
			if(e instanceof B)
			{				
				B objb = (B)e;
				objb.Boo();
				objb.Foo();
			}
		}
	}

}
