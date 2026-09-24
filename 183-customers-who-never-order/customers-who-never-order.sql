Select e.name As Customers from Customers e Left join orders o on e.id = o.customerId where o.customerId is Null;
