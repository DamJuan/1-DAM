SELECT
    emple.dept_no,
    emple.emp_no,
    emple.apellido
FROM
    emple
WHERE
    ( dept_no = 10 )
    OR ( dept_no = 20 )