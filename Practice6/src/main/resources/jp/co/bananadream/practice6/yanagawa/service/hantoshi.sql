SELECT
        unsei.unsei_name
        ,COUNT(omikuji.unsei_id)
    FROM
            result
                LEFT OUTER JOIN omikuji
                    ON result.omikuji_id = omikuji.omikuji_id
                    AND
                        result.update_day > now() - INTERVAL '6 month'


    RIGHT OUTER JOIN unsei
        ON omikuji.unsei_id = unsei.unsei_id
GROUP BY
unsei.unsei_name
,omikuji.unsei_id
ORDER BY
omikuji.unsei_id ASC;
