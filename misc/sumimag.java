class Complex{
	int real;
	int imag;
	Complex(int real){
		this.real=real;
		this.imag=0;
	}
	Complex(int real, int imag){
		this.real=real;
		this.imag=imag;
	}
	void Swap(){
		int temp;
		temp=real;
		real=imag;
		imag=temp;
	}
	Complex Sum(Complex c1){
		c1.real=this.real+c1.real;
		c1.imag=this.imag+c1.imag;
		return c1;
	}
}
class sumimag{
	public static void main(String[] args){
		Complex c1= new Complex(5,6);
		Complex c2= new Complex(6);
		Complex c3= c1.Sum(c2);
		System.out.println("Sum: "+c3.real+"+"+c3.imag+"i");
	}
}