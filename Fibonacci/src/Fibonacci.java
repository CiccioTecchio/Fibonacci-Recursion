public class Fibonacci{

	private int n;
	private int [] num;

	public Fibonacci(int n) {
		this.n=n;
		this.num = new int[3] ;
		this.num[0]=1;
		this.num[1]=1;
		this.num[2]=0;
	}

	public int calcolate(int n){
		int app=0;
		if(n<=0) return 0;
			if(n==1){ num[0]=1;
					  return 	num[0];
			}
			else if(n==2) {
							num[1]=1;
							return num[1];
					}
			else if(app!=0) return num[2];
				 else {
					 num[2]=calcolate(n-1)+calcolate(n-2);
					 app=num[2];
					 return app;
				 }
	}
}
