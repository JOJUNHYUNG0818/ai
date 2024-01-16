DROP DATABASE IF EXISTS GisDB;
CREATE DATABASE GisDB;
USE GisDB;

-- 하천 테이블 생성
CREATE TABLE StreamTbl (
   MapNumber CHAR(10),  -- 지도일련번호
   StreamName CHAR(20),  -- 하천이름
   Stream GEOMETRY ); -- 공간데이터(하천개체)

INSERT INTO StreamTbl VALUES ( '330000001' ,  '한류천', 
   ST_GeomFromText('LINESTRING (-10 30, -50 70, 50 70)'));
INSERT INTO StreamTbl VALUES ( '330000001' ,  '안양천', 
   ST_GeomFromText('LINESTRING (-50 -70, 30 -10, 70 -10)'));
INSERT INTO StreamTbl VALUES ('330000002' ,  '일산천', 
   ST_GeomFromText('LINESTRING (-70 50, -30 -30, 30 -60)'));

select * from streamtbl;

-- 빌딩 테이블 생성
CREATE TABLE BuildingTbl (
   MapNumber CHAR(10),  -- 지도일련번호
   BuildingName CHAR(20),  -- 건물이름
   Building GEOMETRY ); -- 공간데이터(건물개체)

INSERT INTO BuildingTbl VALUES ('330000005' ,  '하나은행', 
   ST_GeomFromText('POLYGON ((-10 50, 10 30, -10 10, -30 30, -10 50))'));
INSERT INTO BuildingTbl VALUES ( '330000001' ,  '우리빌딩', 
   ST_GeomFromText('POLYGON ((-50 -70, -40 -70, -40 -80, -50 -80, -50 -70))'));
INSERT INTO BuildingTbl VALUES ( '330000002' ,  '디티오피스텔', 
   ST_GeomFromText('POLYGON ((40 0, 60 0, 60 -20, 40 -20, 40 0))'));
INSERT INTO BuildingTbl VALUES ( '330000002' ,  '디티오피스텔', 
   ST_GeomFromText('POLYGON ((40 0, 60 0, 60 -20, 40 -20, 30 0))'));
   
select * from BuildingTbl
union all
select * from streamtbl;

-- 안양천에 겹치는 빌딩 출력
SELECT StreamName, BuildingName, Building, Stream
   FROM BuildingTbl , StreamTbl 
   WHERE ST_Intersects(Building, Stream) = 1   AND StreamName = '안양천';
   
select st_buffer(stream,5)from streamtbl;