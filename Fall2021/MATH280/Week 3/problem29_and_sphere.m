clc
clear
clear all

%Problem 29
%x=[-10:10];
%y=[-10:10];
%[x,y] = meshgrid(x,y); 

%z=x.*y.*exp(x+(2*y)-9*(x.^2)-9*(y.^2)); %vector times vwector in grid means you gotta put a dot in your variables

%surf(x,y,z)

%How to make a sphere
[x,y,z] = sphere;
r=5;    %radius = 5
surf(r*x-25,r*y-37,r*z+109)   % A sphere with r = 5, c(25,37,-109)
axis equal