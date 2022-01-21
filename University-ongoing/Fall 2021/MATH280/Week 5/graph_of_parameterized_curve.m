clc     
clear
clear all

t=[0:50];
x=log(t.^2);
y=2.^t;
z=sin(t);
%z=5*t-4;
%r=[log(t^2) 2^t 5*t-4];
plot3(x,y,z)
