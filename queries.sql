## Part 1: Test it with SQL

id int PK
employer varchar(250)
skill varchar(250)
name varchar(250);

## Part 2: Test it with SQL

SELECT name
FROM techjobs.employer
WHERE location = "St.Louis";

## Part 3: Test it with SQL

DROP TABLE job;

## Part 4: Test it with SQL
SELECT *
FROM skill
LEFT JOIN job_skills ON skill.id = job_skills.skill_id
WHERE job_skills.jobs_id IS NOT NULL
ORDER BY name ASC;