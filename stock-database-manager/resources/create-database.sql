CREATE TABLE `stock`.`master_Industry` ( `IndustryId` INT NOT NULL , `IndustryName` VARCHAR(50) NULL DEFAULT NULL ,
`ModifiedOn`  BIGINT NOT NULL , PRIMARY KEY (`IndustryId`)) ENGINE = InnoDB;

CREATE TABLE `stock`.`master_company` ( `CompanyId` INT NOT NULL , `CompanyName` VARCHAR(50) NOT NULL , `IndustryId` INT NOT NULL ,
`ModifiedOn`  BIGINT NOT NULL , PRIMARY KEY (`CompanyId`)) ENGINE = InnoDB;

ALTER TABLE `master_company` ADD CONSTRAINT `company_industry_IndustryId_FK` FOREIGN KEY (`IndustryId`) REFERENCES
`stock`.`master_industry`(`IndustryId`) ON DELETE RESTRICT ON UPDATE RESTRICT;





