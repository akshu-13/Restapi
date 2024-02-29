package com.example.homedecor.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.homedecor.model.Decor;
import com.example.homedecor.repository.DecorRepo;

@Service
public class DecorService {
@Autowired
DecorRepo decorRepo;
@SuppressWarnings("null")
public Decor addDecor(Decor decor)
{
    return decorRepo.save(decor);
}
public List<Decor>getDecors()
{
    return decorRepo.findAll();
}
public Decor putdecor(Long id,Decor decor)
	{
	Decor  decorAvail=decorRepo.findById(id).orElse(null);
		if(decorAvail!=null)
        {
            decorAvail.setEmailId(decor.getEmailId());
        decorAvail.setUserName(decor.getUserName());
        decorAvail.setPassWord(decor.getPassWord());
        decorAvail.setConfirmPass(decor.getConfirmPass());
        
            
            return decorRepo.saveAndFlush(decorAvail);
        }
        else
        return null;
	}
    public String deletedecor(Long id)
    {
        decorRepo.deleteById(id);
        return("DELETED");
    }
}