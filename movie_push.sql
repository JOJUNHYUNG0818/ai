-- ---------------------261 대용량 파일 처리하기 - 파일 올리고(업로드) 내리기(다운로드)
create database moviedb;
create table movietbl
(	movie_id int,
	movie_title varchar(30),
    movie_director varchar(20),
    movie_star varchar(20),
    movie_script longtext,
    movie_film longblob
) default charset = utf8mb4;

insert into movietbl values(1,'쉰들러 리스트','스필버그','리암 니슨',
							load_file('D:\ai\study\temp\Schindler.txt'),
                            load_file('D:\ai\study\temp\Schindler.mp4')
);

select * from movietbl;
show variables like 'max_allowed_packet';
show variables like 'secure_file_priv'; -- mysql 이 지정한경로

truncate movietbl;
insert into movietbl values(1,'쉰들러 리스트','스필버그','리암 니슨',
							load_file('D:/ai/study/temp/Schindler.txt'),
                            load_file('D:/ai/study/temp/Schindler.mp4')
);

select * from movietbl;