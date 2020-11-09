---
layout: page
title: Zhang Wanlin's Project Portfolio Page
---

## Project: Nuudle

Nuudle is a **desktop app for managing patient records and clinic appointments, optimized for use
via a Command Line Interface**(CLI) while still having the benefits of a Graphical User Interface (GUI).
If you can type fast, Nuudle can get your patient and appointment management tasks done faster than traditional GUI apps.
It is written in Java, and has about 19kLoC, of which I contributed 2kLoC.

Given below are my contributions to the project.

* **New Feature**: Added an assign feature that allows users to assign an appointment to a patient.(Pull request [\#85](https://github.com/AY2021S1-CS2103T-T12-4/tp/pull/85), [\#107](https://github.com/AY2021S1-CS2103T-T12-4/tp/pull/107))
    * **Justification**: This feature makes up the signature of the product because it allows the nurse to easily assign an appointment to a patient, which is a must for a medical appointment scheduling application.

* **New Feature**: Added a view feature which allows users to view all appointment on a specific date.(Pull request [\#91](https://github.com/AY2021S1-CS2103T-T12-4/tp/pull/91))
    * **Justification**: This feature improves the product significantly since it allows the nurse to view all the appointments on a certain day without scanning through the appointment book.
    * **Highlights**: Even though multiple methods can be used for the implementation of this feature, it is challenging to be implemented with a more Object-Oriented way because of the unavailability of the required patient. Hence, additional classes are required to encapsulate the user input.

* **Code contributed**: [RepoSense link](https://nus-cs2103-ay2021s1.github.io/tp-dashboard/#breakdown=true&search=zhangwanlin98&sort=groupTitle&sortWithin=title&since=2020-08-14&timeframe=commit&mergegroup=&groupSelect=groupByRepos&checkedFileTypes=docs~functional-code~test-code~other&tabOpen=true&tabType=authorship&zFR=false&tabAuthor=ZhangWanlin98&tabRepo=AY2021S1-CS2103T-T12-4%2Ftp%5Bmaster%5D&authorshipIsMergeGroup=false&authorshipFileTypes=docs~functional-code~test-code)

* **Project management**: none.

* **Enhancements to existing features**:
    * Enhanced find feature from finding by name to finding by name or phone number or NRIC, or any combination of them.(Pull request [\#134](https://github.com/AY2021S1-CS2103T-T12-4/tp/pull/134))
        * **Justification**: This enhancement improves the product greatly as it allows the nurse to search for patients not only by their names but also by phone number and IC number, which significantly improve the convenience of using the product. 

* **Documentation**:
  * User Guide:
    * Added documentation for the features `list`, `edit`and `find`. (Pull request [\#47](https://github.com/AY2021S1-CS2103T-T12-4/tp/pull/47))
    * Authored introduction for `Command` section. (Pull request [\#198](https://github.com/AY2021S1-CS2103T-T12-4/tp/pull/198))
    * Added `Natural Date & Time` section under `Command format`. (Pull request [\#198](https://github.com/AY2021S1-CS2103T-T12-4/tp/pull/198))
    * Added link between `Date & Time format` and `FAQ`. (Pull request [\#198](https://github.com/AY2021S1-CS2103T-T12-4/tp/pull/198))
    * Authored `Glossary` section. (Pull request [\#198](https://github.com/AY2021S1-CS2103T-T12-4/tp/pull/198))

  * Developer Guide:
    * Authored `Use Cases` segment. (Pull request [\#48](https://github.com/AY2021S1-CS2103T-T12-4/tp/pull/48))
    * Updated and maintained the Architecture and Model features, and the corresponding UML diagrams. (Pull request [\#116](https://github.com/AY2021S1-CS2103T-T12-4/tp/pull/116))
    * Added implementation details on the Assign feature, with appropriate UML diagrams. (Pull request [\#116](https://github.com/AY2021S1-CS2103T-T12-4/tp/pull/116))

* **Community**:
  * PRs reviewed (with non-trivial review comments): 
    (example: [\#114](https://github.com/AY2021S1-CS2103T-T12-4/tp/pull/114), [\#96](https://github.com/AY2021S1-CS2103T-T12-4/tp/pull/96))
