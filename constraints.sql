-- ==========================================
-- CREATE DATABASE
-- ==========================================
CREATE DATABASE covid_db;
USE covid_db;

-- ==========================================
-- CREATE COUNTRIES TABLE
-- ==========================================
CREATE TABLE countries (
    Country VARCHAR(100) PRIMARY KEY,
    Population BIGINT NOT NULL
);

-- ==========================================
-- CREATE COVID_CASES TABLE
-- ==========================================
CREATE TABLE covid_cases (
    Country VARCHAR(100) NOT NULL,
    Date DATE NOT NULL,
    Confirmed_Cases INT NOT NULL,
    Deaths INT DEFAULT 0,
    Recoveries INT DEFAULT 0,
    Last_Updated TIMESTAMP DEFAULT CURRENT_TIMESTAMP,

    -- Composite Primary Key
    PRIMARY KEY (Country, Date),

    -- Foreign Key
    CONSTRAINT fk_country
        FOREIGN KEY (Country)
        REFERENCES countries(Country),

    -- Check Constraint
    CONSTRAINT chk_deaths
        CHECK (Deaths <= Confirmed_Cases),

    -- Unique Constraint
    CONSTRAINT uq_country_date
        UNIQUE (Country, Date)
);

-- ==========================================
-- INSERT SAMPLE DATA INTO COUNTRIES
-- ==========================================
INSERT INTO countries (Country, Population)
VALUES
('India', 1400000000),
('USA', 335000000),
('Brazil', 214000000);

-- ==========================================
-- INSERT SAMPLE DATA INTO COVID_CASES
-- ==========================================
INSERT INTO covid_cases
(Country, Date, Confirmed_Cases, Deaths)
VALUES
('India', '2024-01-01', 5000, 50),
('USA', '2024-01-01', 7000, 70),
('Brazil', '2024-01-01', 4000, 40);

-- ==========================================
-- DISPLAY DATA
-- ==========================================
SELECT * FROM countries;
SELECT * FROM covid_cases;