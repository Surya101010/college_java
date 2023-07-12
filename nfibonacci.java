public int nFibonacci(int input1){
        int a=0,b=1;
        int c=0;
        if(input1==1){
            return 0;
        }
        if(input1==2){
            return 1;
        }
		for(int i=2;i<input1;i++){
            c=a+b;
            a=b;
            b=c;
        }
        return c;
}
