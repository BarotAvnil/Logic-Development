-- Create the DEPT table first, as PERSON depends on it
CREATE TABLE DEPT (
    DepartmentID INT PRIMARY KEY,
    DepartmentName VARCHAR(100) NOT NULL UNIQUE,
    DepartmentCode VARCHAR(50) NOT NULL UNIQUE,
    Location VARCHAR(50) NOT NULL
);

-- Create the PERSON table with a Foreign Key
CREATE TABLE PERSON (
    PersonID INT PRIMARY KEY,
    PersonName VARCHAR(100) NOT NULL,
    DepartmentID INT,
    Salary DECIMAL(8, 2) NOT NULL,
    JoiningDate DATE NOT NULL,
    City VARCHAR(100) NOT NULL,
    FOREIGN KEY (DepartmentID) REFERENCES DEPT(DepartmentID)
);

-- Insert data into the DEPT table
INSERT INTO DEPT (DepartmentID, DepartmentName, DepartmentCode, Location)
VALUES
(1, 'Admin', 'Adm', 'A-Block'),
(2, 'Computer', 'CE', 'C-Block'),
(3, 'Civil', 'CI', 'G-Block'),
(4, 'Electrical', 'EE', 'E-Block'),
(5, 'Mechanical', 'ME', 'B-Block'),
(6, 'Marketing', 'Mkt', 'F-Block'),
(7, 'Accounts', 'Acc', 'A-Block');

-- Insert data into the PERSON table
INSERT INTO PERSON (PersonID, PersonName, DepartmentID, Salary, JoiningDate, City)
VALUES
(101, 'Rahul Tripathi', 2, 56000.00, '2000-01-01', 'Rajkot'),
(102, 'Hardik Pandya', 3, 18000.00, '2001-09-25', 'Ahmedabad'),
(103, 'Bhavin Kanani', 4, 25000.00, '2000-05-14', 'Baroda'),
(104, 'Bhoomi Vaishnav', 1, 39000.00, '2005-02-08', 'Rajkot'),
(105, 'Rohit Topiya', 2, 17000.00, '2001-07-23', 'Jamnagar'),
(106, 'Priya Menpara', NULL, 9000.00, '2000-10-18', 'Ahmedabad'),
(107, 'Neha Sharma', 2, 34000.00, '2002-12-25', 'Rajkot'),
(108, 'Nayan Goswami', 3, 25000.00, '2001-07-01', 'Rajkot'),
(109, 'Mehul Bhundiya', 4, 13500.00, '2005-01-09', 'Baroda'),
(110, 'Mohit Maru', 5, 14000.00, '2000-05-25', 'Jamnagar'),
(111, 'Alok Nath', 2, 36000.00, '2003-03-15', 'Ahmedabad'),
(112, 'Seema Jain', 3, 28000.00, '2002-06-18', 'Baroda'),
(113, 'Karan Singh', 1, 41000.00, '2004-11-30', 'Rajkot'),
(114, 'Riya Gupta', 5, 16000.00, '2001-02-12', 'Ahmedabad'),
(115, 'Suresh Patel', 7, 32000.00, '2003-08-20', 'Jamnagar'),
(116, 'Meena Kumari', 7, 30000.00, '2004-01-01', 'Rajkot'),
(117, 'Vikram Batra', NULL, 11000.00, '2005-04-05', 'Baroda');


--------------------------------------Part:A-----------------------------------

--1. Combine information from Person and Department table using cross join or Cartesian product.
SELECT 	*
FROM PERSON
CROSS JOIN DEPT;

--2. Find all persons with their department name.
SELECT
    p.PersonID,
    p.PersonName,
    d.DepartmentName
FROM PERSON p
LEFT JOIN DEPT d ON p.DepartmentID = d.DepartmentID;

--3. Find all persons with their department name & code.
SELECT
    p.PersonID,
    p.PersonName,
    d.DepartmentName,
    d.DepartmentCode
FROM PERSON p
LEFT JOIN DEPT d ON p.DepartmentID = d.DepartmentID;

--4. Find all persons with their department code and location. 
SELECT
    p.PersonID,
    p.PersonName,
    d.DepartmentCode,
    d.Location
FROM PERSON p
LEFT JOIN DEPT d ON p.DepartmentID = d.DepartmentID;

--5. Find the detail of the person who belongs to Mechanical department.
SELECT
    p.*
FROM PERSON p
JOIN DEPT d ON p.DepartmentID = d.DepartmentID
WHERE d.DepartmentName = 'Mechanical';

--6. Final person’s name, department code and salary who lives in Ahmedabad city. 
SELECT
    p.PersonName,
    d.DepartmentCode,
    p.Salary
FROM PERSON p
LEFT JOIN DEPT d ON p.DepartmentID = d.DepartmentID
WHERE p.City = 'Ahmedabad';

--7. Find the person's name whose department is in C-Block.
SELECT
    p.PersonName
FROM PERSON p
JOIN DEPT d ON p.DepartmentID = d.DepartmentID
WHERE d.Location = 'C-Block';

--8. Retrieve person name, salary & department name who belongs to Jamnagar city.
SELECT
    p.PersonName,
    p.Salary,
    d.DepartmentName
FROM PERSON p
LEFT JOIN DEPT d ON p.DepartmentID = d.DepartmentID
WHERE p.City = 'Jamnagar';

--9. Retrieve person’s detail who joined the Civil department after 1-Aug-2001. 
SELECT
    p.*
FROM PERSON p
JOIN DEPT d ON p.DepartmentID = d.DepartmentID
WHERE d.DepartmentName = 'Civil'
  AND p.JoiningDate > '2001-08-01';

--10. Display all the person's name with the department whose joining date difference with the current date is more than 365 days.
SELECT
    p.PersonName,
    ISNULL(d.DepartmentName, 'No Department') AS DepartmentName,
    p.JoiningDate
FROM PERSON p
LEFT JOIN DEPT d ON p.DepartmentID = d.DepartmentID
WHERE DATEDIFF(day, p.JoiningDate, GETDATE()) > 365;

--11. Find department wise person counts.
SELECT 
    d.DepartmentName AS DepartmentName,
    COUNT(p.PersonID) AS PersonCount
FROM PERSON p
LEFT JOIN DEPT d ON p.DepartmentID = d.DepartmentID
GROUP BY d.DepartmentName
ORDER BY DepartmentName;

--12. Give department wise maximum & minimum salary with department name.
SELECT
    d.DepartmentName,
    MAX(p.Salary) AS MaxSalary,
    MIN(p.Salary) AS MinSalary
FROM PERSON p
LEFT JOIN DEPT d ON p.DepartmentID = d.DepartmentID
GROUP BY d.DepartmentName
ORDER BY d.DepartmentName;

--13. Find city wise total, average, maximum and minimum salary.
SELECT
    p.City,
    SUM(p.Salary)   AS TotalSalary,
    AVG(p.Salary)   AS AvgSalary,
    MAX(p.Salary)   AS MaxSalary,
    MIN(p.Salary)   AS MinSalary
FROM PERSON p
GROUP BY p.City
ORDER BY p.City;

--14. Find the average salary of a person who belongs to Ahmedabad city.
SELECT
    AVG(Salary) AS AvgSalaryAhmedabad
FROM PERSON
WHERE City = 'Ahmedabad';

--15. Produce Output Like: <PersonName> lives in <City> and works in <DepartmentName> Department. (In single column).
SELECT
    CONCAT(
        p.PersonName,
        ' lives in ',
        p.City,
        ' and works in ',
        d.DepartmentName,
        ' Department.'
    ) AS Info
FROM PERSON p
LEFT JOIN DEPT d ON p.DepartmentID = d.DepartmentID;

------------------------------------Part:B---------------------------------

--1. Produce Output Like: <PersonName> earns <Salary> from <DepartmentName> department monthly. (In single column).
SELECT
  CONCAT(
    p.PersonName,
    ' earns ',
    CAST(p.Salary AS VARCHAR(20)),
    ' from ',
    ISNULL(d.DepartmentName, 'No Department'),
    ' department monthly.'
  ) AS Info
FROM PERSON p
LEFT JOIN DEPT d ON p.DepartmentID = d.DepartmentID;

--2. Find city & department wise total, average & maximum salaries. 
SELECT
  p.City,
  ISNULL(d.DepartmentName, 'No Department') AS DepartmentName,
  SUM(p.Salary)   AS TotalSalary,
  AVG(p.Salary)   AS AvgSalary,
  MAX(p.Salary)   AS MaxSalary
FROM PERSON p
LEFT JOIN DEPT d ON p.DepartmentID = d.DepartmentID
GROUP BY
  p.City,
  ISNULL(d.DepartmentName, 'No Department')
ORDER BY
  p.City, DepartmentName;

--3. Find all persons who do not belong to any department.
-- This returns persons with NULL DepartmentID or with a DepartmentID that has no matching row in DEPT
SELECT
  p.PersonID,
  p.PersonName,
  p.DepartmentID,
  p.Salary,
  p.JoiningDate,
  p.City
FROM PERSON p
LEFT JOIN DEPT d ON p.DepartmentID = d.DepartmentID
WHERE d.DepartmentID IS NULL;

--4. Find all departments whose total salary is exceeding 100000.
SELECT
  d.DepartmentID,
  d.DepartmentName,
  SUM(p.Salary) AS TotalSalary
FROM DEPT d
JOIN PERSON p ON p.DepartmentID = d.DepartmentID
GROUP BY
  d.DepartmentID,
  d.DepartmentName
HAVING SUM(p.Salary) > 100000
ORDER BY TotalSalary DESC;

------------------------------------Part:C---------------------------------

--1. List all departments who have no person.
SELECT
  d.DepartmentID,
  d.DepartmentName,
  d.DepartmentCode,
  d.Location
FROM DEPT d
LEFT JOIN PERSON p ON d.DepartmentID = p.DepartmentID
WHERE p.PersonID IS NULL;

--2. List out department names in which more than two persons are working.
SELECT
  d.DepartmentID,
  d.DepartmentName,
  COUNT(p.PersonID) AS PersonCount
FROM DEPT d
JOIN PERSON p ON d.DepartmentID = p.DepartmentID
GROUP BY d.DepartmentID, d.DepartmentName
HAVING COUNT(p.PersonID) > 2
ORDER BY PersonCount DESC;

--3. Give a 10% increment in the computer department employee’s salary. (Use Update). 
--This is an UPDATE query. To verify your work, run a SELECT query on the PERSON table
--for the 'Computer' department before and after your UPDATE.
-- 3A: Show current salaries for 'Computer' department (before update)
SELECT
  p.PersonID,
  p.PersonName,
  p.Salary,
  d.DepartmentName
FROM PERSON p
JOIN DEPT d ON p.DepartmentID = d.DepartmentID
WHERE d.DepartmentName = 'Computer'
ORDER BY p.PersonID;

-- 3B: Apply 10% increment (run this to update)
BEGIN TRANSACTION;

UPDATE p
SET p.Salary = ROUND(p.Salary * 1.10, 2)     -- rounding to 2 decimals
FROM PERSON p
JOIN DEPT d ON p.DepartmentID = d.DepartmentID
WHERE d.DepartmentName = 'Computer';

-- 3C: Show salaries after update (verify results)
SELECT
  p.PersonID,
  p.PersonName,
  p.Salary,
  d.DepartmentName
FROM PERSON p
JOIN DEPT d ON p.DepartmentID = d.DepartmentID
WHERE d.DepartmentName = 'Computer'
ORDER BY p.PersonID;

------------------------------Advanced Query-----------------------------
-- Create Author table
CREATE TABLE Author (
    AuthorID INT PRIMARY KEY,
    AuthorName VARCHAR(100) NOT NULL,
    Country VARCHAR(50) NULL
);

-- Create Publisher table
CREATE TABLE Publisher (
    PublisherID INT PRIMARY KEY,
    PublisherName VARCHAR(100) NOT NULL UNIQUE,
    City VARCHAR(50) NOT NULL
);

-- Create Book table with Foreign Keys
CREATE TABLE Book (
    BookID INT PRIMARY KEY,
    Title VARCHAR(200) NOT NULL,
    AuthorID INT NOT NULL,
    PublisherID INT NOT NULL,
    Price DECIMAL(8, 2) NOT NULL,
    PublicationYear INT NOT NULL,
    FOREIGN KEY (AuthorID) REFERENCES Author(AuthorID),
    FOREIGN KEY (PublisherID) REFERENCES Publisher(PublisherID)
);

-- Insert into Author
INSERT INTO Author (AuthorID, AuthorName, Country)
VALUES
(1, 'Chetan Bhagat', 'India'),
(2, 'Arundhati Roy', 'India'),
(3, 'Amish Tripathi', 'India'),
(4, 'Ruskin Bond', 'India'),
(5, 'Jhumpa Lahiri', 'India'),
(6, 'Paulo Coelho', 'Brazil'),
(7, 'Sudha Murty', 'India'),
(8, 'Vikram Seth', 'India'),
(9, 'Kiran Desai', 'India'); -- Author with no books

-- Insert into Publisher
INSERT INTO Publisher (PublisherID, PublisherName, City)
VALUES
(1, 'Rupa Publications', 'New Delhi'),
(2, 'Penguin India', 'Gurugram'),
(3, 'HarperCollins India', 'Noida'),
(4, 'Aleph Book Company', 'New Delhi'),
(5, 'Westland', 'Chennai');

-- Insert into Book
INSERT INTO Book (BookID, Title, AuthorID, PublisherID, Price, PublicationYear)
VALUES
(101, 'Five Point Someone', 1, 1, 250.00, 2004),
(102, 'The God of Small Things', 2, 2, 350.00, 1997),
(103, 'Immortals of Meluha', 3, 3, 300.00, 2010),
(104, 'The Blue Umbrella', 4, 1, 180.00, 1980),
(105, 'The Lowland', 5, 2, 400.00, 2013),
(106, 'Revolution 2020', 1, 1, 275.00, 2011),
(107, 'Sita: Warrior of Mithila', 3, 3, 320.00, 2017),
(108, 'The Room on the Roof', 4, 4, 200.00, 1956),
(109, 'A Suitable Boy', 8, 2, 600.00, 1993),
(110, 'Scion of Ikshvaku', 3, 5, 350.00, 2015),
(111, 'Wise and Otherwise', 7, 2, 210.00, 2002),
(112, '2 States', 1, 1, 260.00, 2009);

------------------------------------Part:1---------------------------------

--1. List all books with their authors.
SELECT
  B.BookID,
  B.Title,
  A.AuthorName
FROM Book B
JOIN Author A ON B.AuthorID = A.AuthorID;

--2. List all books with their publishers.
SELECT
  B.BookID,
  B.Title,
  P.PublisherName
FROM Book B
JOIN Publisher P ON B.PublisherID = P.PublisherID;

--3. List all books with their authors and publishers.
SELECT
  B.BookID,
  B.Title,
  A.AuthorName,
  P.PublisherName,
  B.Price,
  B.PublicationYear
FROM Book B
JOIN Author A    ON B.AuthorID    = A.AuthorID
JOIN Publisher P ON B.PublisherID = P.PublisherID;

--4. List all books published after 2010 with their authors and publisher and price
SELECT
  B.BookID,
  B.Title,
  A.AuthorName,
  P.PublisherName,
  B.Price,
  B.PublicationYear
FROM Book B
JOIN Author A    ON B.AuthorID    = A.AuthorID
JOIN Publisher P ON B.PublisherID = P.PublisherID
WHERE B.PublicationYear > 2010;

--5. List all authors and the number of books they have written.
SELECT
  A.AuthorID,
  A.AuthorName,
  COUNT(B.BookID) AS BookCount
FROM Author A
LEFT JOIN Book B ON A.AuthorID = B.AuthorID
GROUP BY A.AuthorID, A.AuthorName;

--6. List all publishers and the total price of books they have published.
SELECT
  P.PublisherID,
  P.PublisherName,
  SUM(B.Price) AS TotalPrice
FROM Publisher P
LEFT JOIN Book B ON P.PublisherID = B.PublisherID
GROUP BY P.PublisherID, P.PublisherName;

--7. List authors who have not written any books.
SELECT
  A.AuthorID,
  A.AuthorName
FROM Author A
LEFT JOIN Book B ON A.AuthorID = B.AuthorID
WHERE B.BookID IS NULL;

--8. Display total number of Books and Average Price of every Author. 
SELECT
  A.AuthorID,
  A.AuthorName,
  COUNT(B.BookID) AS TotalBooks,
  AVG(B.Price) AS AvgPrice
FROM Author A
LEFT JOIN Book B ON A.AuthorID = B.AuthorID
GROUP BY A.AuthorID, A.AuthorName;

--9. lists each publisher along with the total number of books they have published, sorted from highest to lowest.
SELECT
  P.PublisherID,
  P.PublisherName,
  COUNT(B.BookID) AS TotalBooks
FROM Publisher P
LEFT JOIN Book B ON P.PublisherID = B.PublisherID
GROUP BY P.PublisherID, P.PublisherName
ORDER BY TotalBooks DESC;

--10. Display number of books published each year.
SELECT
  B.PublicationYear,
  COUNT(*) AS NumBooks
FROM Book B
GROUP BY B.PublicationYear
ORDER BY B.PublicationYear;
