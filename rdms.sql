-- ===========================================
-- COVID-19 Database Management System
-- ===========================================

-- Step 1: Create Database
CREATE DATABASE covid_database;

-- Use Database
USE covid_database;

-- ===========================================
-- Step 2: Create Tables
-- ===========================================

-- Table: covid_cases
CREATE TABLE covid_cases (
    Case_ID INT PRIMARY KEY AUTO_INCREMENT,
    Country VARCHAR(50) NOT NULL,
    Report_Date DATE NOT NULL,
    Confirmed_Cases INT NOT NULL,
    Deaths INT DEFAULT 0,
    Recoveries INT DEFAULT 0,
    Population BIGINT
);

-- Table: covid_deaths
CREATE TABLE covid_deaths (
    Death_ID INT PRIMARY KEY AUTO_INCREMENT,
    Country VARCHAR(50) NOT NULL,
    Report_Date DATE NOT NULL,
    Total_Deaths INT NOT NULL,
    New_Deaths INT
);

-- Table: covid_vaccines
CREATE TABLE covid_vaccines (
    Vaccine_ID INT PRIMARY KEY AUTO_INCREMENT,
    Country VARCHAR(50) NOT NULL,
    Report_Date DATE NOT NULL,
    Total_Vaccinations BIGINT,
    Fully_Vaccinated BIGINT,
    Booster_Doses BIGINT
);

-- ===========================================
-- Step 3: Insert Sample Data
-- ===========================================

INSERT INTO covid_cases
(Country, Report_Date, Confirmed_Cases, Deaths, Recoveries, Population)
VALUES
('India', '2021-06-01', 28000000, 330000, 26000000, 1393409038),
('India', '2021-06-02', 28150000, 331500, 26100000, 1393409038),
('USA', '2021-06-01', 33300000, 595000, 27000000, 331002651),
('USA', '2021-06-02', 33350000, 596000, 27100000, 331002651),
('UK', '2021-06-01', 4500000, 128000, 4300000, 67886011),
('UK', '2021-06-02', 4515000, 128100, 4310000, 67886011);

-- View inserted data
SELECT * FROM covid_cases;

-- ===========================================
-- Step 4: Update Existing Record
-- ===========================================

-- Revised confirmed cases for India on 2021-06-02
UPDATE covid_cases
SET Confirmed_Cases = 28200000
WHERE Country = 'India'
  AND Report_Date = '2021-06-02';

-- Verify update
SELECT * FROM covid_cases
WHERE Country = 'India';

-- ===========================================
-- Step 5: Delete Incorrect Record
-- ===========================================

-- Delete incorrect country name
DELETE FROM covid_cases
WHERE Country = 'IN';

-- ===========================================
-- Step 6: Delete Duplicate Records
-- ===========================================

DELETE c1
FROM covid_cases c1
JOIN covid_cases c2
ON c1.Country = c2.Country
AND c1.Report_Date = c2.Report_Date
AND c1.Case_ID > c2.Case_ID;

-- ===========================================
-- Step 7: Display Final Data
-- ===========================================

SELECT * FROM covid_cases;