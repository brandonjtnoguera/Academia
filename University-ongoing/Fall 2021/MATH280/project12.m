%ch 12 project - number 3
clc
clear
clear all

m = 12;
d=8;
y=2000;
dx=.01;
dy=.01;
dA=dx*dy;
x=[-30:dx:30];
y=[-30:dy:30];
[x,y]=meshgrid(x,y);

z=4*sqrt(1 - x.^2 - (y/27).^2);
z(imag(z)~=0)=0;

s=z*dA;
ss=sum(s);
sss=sum(ss);
V=2*sss;

clc
clear
clear all

syms g(x,y,z);

g = [((x/12).^2 + (y/8).^2 + (z/1).^2)-1];
interval = [-30 30 -30 30 -30 30];
fimplicit3(g,interval); 