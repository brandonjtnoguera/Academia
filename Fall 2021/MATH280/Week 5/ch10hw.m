clc     
clear
clear all

t=[0:100];
x=(8*t.^12);
y=sin(t/12);
z=8./(exp(t));
plot3(x,y,z);
