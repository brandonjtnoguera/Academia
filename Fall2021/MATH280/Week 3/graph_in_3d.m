clc
clear
clear all

x=[-10:10];
y=[-10:10];
[x,y]=meshgrid(x,y); %creates a grid

z=(x.^2)-(y.^2); %need a period if you wanna od math on a graph
surf(x,y,z); %spews out the image