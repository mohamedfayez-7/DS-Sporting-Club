Sporting club application:
The idea of the application is about a sporting club with three branches, in all branches there is a subscription to three games namely football, basketball and handball, each branch has its own server, but these servers are connected in peer to peer network, also they connected to a main server , this main server contains array list of these different sports with its subscription value, ex: sports (“Football”,500) (“Basketball”,300)(“Handball”,400) that will used in the interface of all peers.
•	Servers should view all sport names and their subscription value and reload if any updates happen from any branch.
•	Branches (Subscriber) should view all sport names and their subscription value: reload if any update happens from any branch and update if the branch wants to update a subscription value of any sport.
Once a branch updates the subscription value, it will show the new subscription value all over the peers if they press reload.
