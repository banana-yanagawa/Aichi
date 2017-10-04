SELECT
        unsei.unsei_name
        ,result.update_day
        ,omikuji.akinai
        ,omikuji.negaigoto
        ,omikuji.gakumon
    FROM
        omikuji INNER JOIN unsei
            ON omikuji.unsei_id = unsei.unsei_id INNER JOIN result
            ON omikuji.omikuji_id = result.omikuji_id
WHERE
    result.birthday =
    /*day*/'1995-03-25'
    AND result.update_day > now() - INTERVAL '6 month'
ORDER BY
    result.update_day ASC;
