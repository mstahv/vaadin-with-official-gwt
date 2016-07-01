# Vaadin with Java 8 on the client side

Since Vaadin 7 the GWT stuff is included with the Vaadin distribution. In 7.7 the 
module structure was changed so that GWT classes are split into different modules, 
like the std GWT is packaged (and some more). This also makes it possible to
use a specific version of GWT. The most interesting opportunity is of course to 
use 2.8 series GWT, which provides support for Java 8 (and Java 8 only) and 
a highly improved JSInterop stuff.

This example app shows how you can build Vaadin widgetset using Java 8 and how
one can make widgets using GWT 2.8 for Vaadin. Java 8 is great, also on the client
side!

A more detailed explanation to be published as a blog post in upcoming weeks.
