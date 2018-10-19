/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.pegadaian.trainingspringboot.controller;

import id.co.pegadaian.trainingspringboot.dao.NasabahDao;
import id.co.pegadaian.trainingspringboot.entity.Nasabah;
import java.util.List;
import java.util.Optional;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author anggi
 */
@Controller
public class NasabahController {

    @Autowired
    NasabahDao nasabahDao;

    @GetMapping("/nasabah/form")
    public String formNasabah(@RequestParam(required = false) String id, ModelMap modelMap,
            @PageableDefault(size = 2) Pageable pageable) {
        Nasabah nasabah = new Nasabah();

        if (StringUtils.hasText(id)) {
            Optional<Nasabah> n = nasabahDao.findById(id);
            if (n.isPresent()) {
                nasabah = n.get();
            }
        }

        modelMap.put("nasabah", nasabah);

//        List<Nasabah> dataNasabah = (List<Nasabah>) nasabahDao.findAll();
        Page<Nasabah> dataNasabah = nasabahDao.findAll(pageable);
        modelMap.put("data", dataNasabah);
        return "nasabah/form";
    }

    @PostMapping("/nasabah/form")
    public String simpanNasabah(@Valid Nasabah nasabah, BindingResult errors, ModelMap modelMap) {

        if (errors.hasErrors()) {
            modelMap.put("nasabah", nasabah);
            List<Nasabah> dataNasabah = (List<Nasabah>) nasabahDao.findAll();
            modelMap.put("data", dataNasabah);
            return "nasabah/form";
        }

        nasabahDao.save(nasabah);
        return "redirect:/nasabah/form";
    }

    @GetMapping("/nasabah/form/delete")
    public String deleteNasabah(@RequestParam(required = true) String id) {
        Optional<Nasabah> nasabah = nasabahDao.findById(id);

        if (nasabah.isPresent()) {
            nasabahDao.delete(nasabah.get());
        }

        return "redirect:/nasabah/form";
    }

}
