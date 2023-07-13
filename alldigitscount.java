public int alldigitscount(int input1){
  	int count=0;
        if(input1>=10000){
            count=5;
        }
        else if(input1>=1000){
            count=4;
        }
        else if(input1>=100){
            count=3;
        }
        else if(input1>=10){
            count=2;
        }
        else {
            count=1;
        }
        return count;
	}
}
