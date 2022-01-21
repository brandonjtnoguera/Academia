clc
clear
clear all



% The function we'll be using is of the form f(x,y,z), the constraint will
% be g(x,y,z) which is the ellipsoid
syms f(x,y,z) g(x,y,z) k;


% This is my f function
f(x,y,z) = [(x-2000).^2 + (y-12).^2 + (z-8).^2];

% The derivative of f with respect to x
diff(f,x);

% The derivative of f with respect to y
diff(f,y);

% The derivative of f with respect to z
diff(f,z);

% The gradient of f
gradient(f,[x,y,z]);


% This is my ellipsoid/constraint
g(x,y,z) = [(x/12).^2 + (y/8).^2 + z.^2];

% The derivative of g with respect to x
diff(g,x);

% The derivative of g with respect to y
diff(g,y);

% The derivative of g with respect to z
diff(g,z);

% The gradient of g
gradient(g,[x,y,z]);



% Plotting ellipsoid
g=((x/12).^2+(y/8).^2+(z).^2)-1
interval = [-30 30 -30 30 -30 30]
fimplicit3(g, interval)