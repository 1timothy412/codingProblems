import math
n = int(input());

sum = 0;
i=1;
while(i<n+1):

    sum += int(math.pow(-1,i)*i);
    i=i+1

print (sum);
