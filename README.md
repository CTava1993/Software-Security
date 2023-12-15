# Software-Security
 
~This README file will also address a few prompts that my professor asked at the end of the course.

 
=Briefly summarize your client, Artemis Financial, and their software requirements. Who was the client? What issue did they want you to address?

Artemis Financial was meant to be a company that designed financial plans for it's customers. Things such as 401k plans, so the idea was the develop code that could securely hold information via encryption. As you can imagine, when it comes to someone else's money, it fits the bill just perfectly for a security project.

=What did you do very well when you found your client’s software security vulnerabilities? Why is it important to code securely? What value does software security add to a company’s overall wellbeing?

Software security is everything. Especially in this day and age. We live in the post-information era, so it's more accessible than ever to compromise information for devious purposes. I would like to think that I did a great job pertaining to keeping my report very simplified when I found vulnerabilities. It's easy to become overwhelmed by the maven dependency reports, so I had to filter out a lot and find the important stuff.

=What part of the vulnerability assessment was challenging or helpful to you?

A vast majority was helpful for me in that it's perspective. I had minimal experience to software security prior to this course, so seeing what things a security engineer would focus on or pay attention to in order to improve security. As for challenges? The hardes part for me was getting the certificate information working to host the hash value. It just didn't click for a while.

=How did you increase layers of security? In the future, what would you use to assess vulnerabilities and decide which mitigation techniques to use?

This is explained in the very .doc file in this repository, but to highlight it I started with choosing a cipher based on java coding standards. After that, we applied a certificate for the host. You can even go a step forward with this and apply extra coding layers like Role-based if-statements and such.

=How did you make certain the code and software application were functional and secure? After refactoring the code, how did you check to see whether you introduced new vulnerabilities?

Yes. The dependency check was run AFTER the refactoring, as well as a manual check. I don't consider my knowledge up to snuff to make a good call on how secure my code is in terms of being ready in a professional world, however for what was needed in the assignment, the code should be sufficient. 

=What resources, tools, or coding practices did you use that might be helpful in future assignments or tasks?

I can see the Java Assessment Process Flow Diagram being useful for general use reference in the future. I can also see certificate generation via the keytool in java being useful as well. Aside from this, like I said, most of the useful information I recieved from this class is based around perspective so I know what I would be looking for. In the field I imagine I need more information from my employer to know what's useful.

=Employers sometimes ask for examples of work that you have successfully completed to show your skills, knowledge, and experience. What might you show future employers from this assignment?

I would probably use this submission to show my thought process of what I did. It would be a combination of my code as well as the text document to show how I tackled the problem I was presented to fix in this assignment. While the course was certainly useful for me, I feel like this primarily just scratches to basics of software security and wouldn't exactly wow an employer unless I knew how to extrapolate relevant skill usage.
