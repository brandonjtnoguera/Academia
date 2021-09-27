clc
clear
clear all

syms r(t);
r(t) = [t^4 log(t) sin(3*t-7)];
v=diff(r,t)
a = diff(v,t);
IA=int(a,t) %int = integral, dif = differential
IV=int(v,t)