public int isprime(int input1){
  int val=0;
  if(input1==2){
      val=2;
  }
  for(int i=2;i<Math.sqrt(input1);i++){
       if(input1%i==0){
            val=1;
            break;
        }
        else{
            val=2;
            }
        }
	return val;
}
