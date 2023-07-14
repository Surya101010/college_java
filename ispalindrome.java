public int ispalindrome(int intput1){
      int temp=0,sum=0,x=input1;
    while(input1>0){
        temp=input1%10;
        sum=sum*10+ temp;
        input1=input1/10;
    }
    if(x==sum){
        return 2;
    }
    else{
        return 1;
    }
  }
