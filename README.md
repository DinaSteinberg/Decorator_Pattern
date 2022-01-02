# Decorator_Pattern
This was really an assignment for my computer methodology course, but I enjoyed working on it.
It demonstrates the decorator pattern, which utilizes an interface that is implemented by 2 classes: the base class and the decorator class.
The decorator classes serve as wrapper classes for the base class, so that decorator classes have parameters to hold a base class that it wraps around. Decorator classes can 
also wrap around other decorator classes, so that you create a chain of classes wrapped within each other.
This design pattern is utilized when you want to calculate a total, or if you want a sentence that describes what you just created. Starting with the outer decorator, each calls its
internal class and adds something untill it reaches the base class, where the chain is complete.

HTML tags are the perfect example to illustrate this ingenious design pattern, because they have open and close tabs. In addition, they already have the construct of bases and 
decorators.
