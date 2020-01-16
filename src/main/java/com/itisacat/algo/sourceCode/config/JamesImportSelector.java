package com.itisacat.algo.sourceCode.config;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class JamesImportSelector implements ImportSelector {
	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata){
		//返回全类名的bean
		return new String[]{"com.itisacat.algo.sourceCode.bean.Fish","com.itisacat.algo.sourceCode.bean.Tiger"};
	}
}
