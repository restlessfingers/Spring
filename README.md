# Spring

The programm had an error when it was tryed to add a new register 'The database returned no natively generated identity value'.
The solution was change my table directly in DB with 'ALTER TABLE book MODIFY COLUMN id INT auto_increment' statement.
