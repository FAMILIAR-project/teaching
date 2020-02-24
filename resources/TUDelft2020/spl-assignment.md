# Software variability management essay

This assignment is part of of a larget assignment of the [Software Architecture course](https://se.ewi.tudelft.nl/delftswa/2020/) of the Delft University of Technology, for which students study the architecture of an open-source system during 4 months.

## Assignement 

The purpose of this assignment is to analyze and assess how configurability is handled in your system under analysis.
To that end, write an essay addressing:

1. The variability that is present in the system (by buidling a feature model).
2. The way variability is _managed_, both in terms of finding the requirements, and in terms of the development process.
3. The way variability is _implemented_, and when variability is resolved to a product (the binding time).

Below further details are provided for the above three analyses. Conclude by offering an _assessment_ of the way variability is handled in your system under analysis, possibly including recommendations for making variability management more effective and efficient.


## Variability modeling

1. Identify the main features (i.e., functionalities) offered by your application. Consider the perspective of the different stakeholders when exploring the documentation and/or source code. Focus on features that can vary per product, and explain who benefits from this added variability complexity. Target a minimum of 10 variable features. _**Hint**: There are different kinds of variability. If the functionalities are limited, look at the different platforms that your application supports (for instance, different operating systems, different databases, different web browsers, etc.)._

2. Identify incompatibilities between the offered variable features, if any. Give examples of allowed configurations/products. _**Hint**: documentation should tell you if certain features are only accessible under certain circumstances, bug reports and pull requests will tell you if there are any compatibility issues being dealt with (or have been dealt with). Going through pull requests and bug reports may allow you to identify most recent features._

3. Build a feature model synthesizing the information above. It is highly recommended to use a feature modeling tool for this step, for instance, [FeatureIDE](https://featureide.github.io) (there are [tutorials](https://featureide.github.io/#documentation) and a [screencast](http://wwwiti.cs.uni-magdeburg.de/iti_db/research/featureide/screencasts/FeatureIDEv2.3.6.mpeg) available on the FeatureIDE website). If your application offers multiple unrelated options, you can consider building multiple feature models (if they are disconnected). For instance, one feature model representing the functionalities and one feature model representing the platforms supported by the application.

## Variability management

1. Identify how variability is managed for the different stakeholders. In particular, what are the sources of information that the user can consult to run different configurations/products? And what are the sources of information that the developers can rely on when updating the application?

2. Identify (potential) mechanisms put in place to ease variability management. For instance, are there particular aspects of the development lifecycle in place to address variability concerns, like, testing multiple configurations/products?

## Variability implementation mechanism and binding time

1. Identify and discuss the variability implementation mechanism(s) and biding time(s) used in your application. For that, take two of the variable features identified previously and explain how they are implemented and using which kind of variability implementation mechanism.

2. Discuss the design choice made by the developer to handle variability in their application w.r.t. potential future developments and extensions. In your opinion, are the variability implementation mechanisms and variability binding time scalable if additional functionalities are added to the application?
