Let's consider we want to build a payment system where users can pay using different methods like credit
cards, PayPal or Debit cards
So without the strategy pattern, what we typically we may do is we can have a function where we will put if else conditions to check what kind of payment method has been supplied, and accordingly, we can have our own business logic to handle that case.
This often leads to less mentally less maintainable and less flexible code.
Also it's going to violate the open closed principle.
If we want to add a new payment method like UPI, then we will have to modify the existing if else conditions so that we can handle this new addition