package com.hms.api.serviceimpl;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hms.api.dao.MedicineCompanyDao;
import com.hms.api.dao.MedicineDao;
import com.hms.api.entity.User;
import com.hms.api.entity.MedicineCompany;
import com.hms.api.service.MedicineCompanyService;

/**
 * @author RAM
 *
 */
@Service
public class MedicineCompanyServiceImp implements MedicineCompanyService {

	@Autowired
	private MedicineCompanyDao medicineCompanyDao;

	@Override
	public MedicineCompany addMedicineCompany(MedicineCompany medicineCompany) {
		return null;
	}

	@Override
	public boolean deleteMedicineCompanyById(String id) {
		return false;
	}

	@Override
	public MedicineCompany getMedicineCompanyById(String id) {
		return null;
	}

	@Override
	public MedicineCompany updateMedicineCompany(MedicineCompany medicineCompany) {
		return null;
	}

	@Override
	public List<MedicineCompany> getAllMedicineCompanys() {
		return null;
	}

	@Override
	public List<MedicineCompany> getCompanysByName(String companyName) {
		return null;
	}

	@Override
	public MedicineCompany getCompanyByName(String companyName) {
		return null;
	}

	@Override
	public Long getCountByRegisteredDate(String registeredDate) {
		return null;
	}

	@Override
	public List<MedicineCompany> getTop5CompanyAddedByDate(String registeredDate) {
		return null;
	}

}
