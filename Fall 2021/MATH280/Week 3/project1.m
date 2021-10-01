clc
clear
clear all

[x,y,z] = sphere; %the sphere

v1 = [8 -12 0];
v2 = [12 10 -8];
dot(v1,v2);
cross(v1,v2);
cross(v2,v1);
5*v2-3*v1


x = x*20;
y = y*2000;
z = z*2000;
r = 4;

surf(r*x+20, r*y+2000, r*z+2000);